package be.filipvde.infra.api.mapper;

import be.filipvde.common.utils.DateTimeUtil;
import be.filipvde.domain.movies.model.Movie;
import be.filipvde.domain.movies.model.Rate;
import info.movito.themoviedbapi.model.MovieDb;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MovieMapper {

    public static Movie toDomain(final MovieDb movieDb) {
        if (movieDb == null) {
            return null;
        }
        return Movie.builder()
                .id(String.valueOf(movieDb.getId()))
                .title(movieDb.getTitle())
                .synopsys(movieDb.getOverview())
                .rate(new Rate(movieDb.getPopularity()))
                .releaseDate(DateTimeUtil.getFromISO(movieDb.getReleaseDate()))
                .build();
    }
}