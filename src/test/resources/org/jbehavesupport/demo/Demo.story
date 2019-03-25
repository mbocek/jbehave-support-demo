Demo story to show part of jbehave-support capabilities

Narrative:
In order to verify google search capability
As a development team
I want to check that jbehave-support is searchable

Scenario: Search jbehave-support in google index

Given [GOOGLE] homepage is open
When on [home] page these actions are performed:
| element       | action | data                      |
| search.text   | FILL   | embeditcz jbehave-support |
| search.button | CLICK  |                           |
Then on [home] page these conditions are verified:
| element       | property | data    | verifier |
| search.output | TEXT     | EmbedIT | CONTAINS |
