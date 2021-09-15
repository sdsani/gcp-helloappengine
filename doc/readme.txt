Doc from GCP
============
https://cloud.google.com/appengine/docs/standard/java11/building-app/writing-web-service


Tutorial used here
==================
https://medium.com/@smccartney09/deploy-a-spring-boot-api-to-gcp-app-engine-722198bab4d4


https://developers.google.com/accounts/docs/application-default-credentials
java.io.IOException: The Application Default Credentials are not available. They are available if running in Google Compute Engine. Otherwise, the environment variable GOOGLE_APPLICATION_CREDENTIALS must be defined pointing to a file defining the credentials. See https://developers.google.com/accounts/docs/application-default-credentials for more information.
	at com.google.auth.oauth2.DefaultCredentialsProvider.getDefaultCredentials(DefaultCredentialsProvider.java:134) ~[google-auth-library-oauth2-http-0.26.0.jar:na]
	at com.google.auth.oauth2.GoogleCredentials.getApplicationDefault(GoogleCredentials.java:120) ~[google-auth-library-oauth2-http-0.26.0.jar:na]

XXX