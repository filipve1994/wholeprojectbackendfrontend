package be.filipvde.domain.movies.model;

import jakarta.validation.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonTest {

    private Validator validator;

    @BeforeEach
    public void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    void should_be_person_valid() {
        // given
        final Person person = new Person("name", "firstName");
        // when
        Set<ConstraintViolation<Person>> violations = validator.validate(person);
        // then
        assertTrue(violations.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("personParameters")
    void should_not_be_person_valid_due_to_name_or_firstname_null_or_empty(final String name,
                                                                           final String firstName) {
        // given
        final Person person = new Person(name, firstName);
        // when
        Set<ConstraintViolation<Person>> violations = validator.validate(person);
        // then
        assertFalse(violations.isEmpty());
    }

    private static Stream<Arguments> personParameters() {
        return Stream.of(
                Arguments.of("", "firstname"),
                Arguments.of(null, "firstname"),
                Arguments.of("name", ""),
                Arguments.of("name", null),
                Arguments.of("", ""),
                Arguments.of(null, null)
        );
    }

}