// https://docs.cypress.io/guides/references/configuration

import dotenv from "dotenv";

// dotenv.config({ path: ".env.local" });
dotenv.config();

import { defineConfig } from "cypress";
import { cypressCodegen } from "cypress-codegen";

//plugins now
import registerDurationMetricsPlugin from 'cypress-duration-metrics/plugin';


export default defineConfig({
  // Global options
  //Any values to be set as environment variables.
  env: {

  },
  reporter: 'cypress-mochawesome-reporter',
  reporterOptions: {
    reportDir: 'cypress/results',
    charts: true,
    embeddedScreenshots: true,
    ignoreVideos: false,
    videoOnFailOnly: false,
    inlineAssets: false,
    saveAllAttempts: true,
    overwrite: true,
  },
  e2e: {
    baseUrl: process.env.CYPRESS_BASE_URL || "http://localhost:1234",
    specPattern: "cypress/tests/**/*.spec.{js,jsx,ts,tsx}",
    supportFile: "cypress/support/e2e.ts",
    setupNodeEvents(on, config) {
      // implement node event listeners here
      cypressCodegen(on, config);

      require('cypress-mochawesome-reporter/plugin')(on);
      registerDurationMetricsPlugin(on);

      return config;

    },
  },

  downloadsFolder: 'cypress/downloads',
  fixturesFolder: 'cypress/fixtures',
  screenshotsFolder: 'cypress/screenshots',
  videosFolder: 'cypress/videos',
});