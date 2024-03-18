Feature: Validating Place API's

Scenario Outline: Verify if Place is being Successfully added using AddplaceAPI

Given Add place payload with "<name>" "<language>" "<address>"

When user calls "AddPlaceApi" with "POST" http request
Then the Api call got success with status code 200
And "status" in response body is "OK"
And "scope" in response body is "APP"


Examples:

| name      | language  | address            |
| Kumudhouse|   Bhojpuri|   Anand Nagar Siwan |
|Ashishhouse| HindiBhojpuri|Greater Noida|