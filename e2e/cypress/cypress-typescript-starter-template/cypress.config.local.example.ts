import { defineConfig } from "cypress";
import baseConfig from "./cypress.config";

// https://medium.com/@dingraham01/cypress-easy-multi-environment-configuration-c18ac94971d5

const e2eOverride = {
  baseUrl: 'https://my-qa-url.com/',
}

const envOverride = {
  MY_USER: process.env.MY_QA_USERNAME,
  MY_PASSWORD: process.env.MY_QA_PASSWORD,
}

export default defineConfig({
  ...baseConfig,

  // Global options
  e2e: {
    ...baseConfig.e2e,
    ...e2eOverride
  },
  env: {
    ...baseConfig.env,
    ...envOverride
  }
});
