Demo story to show part of jbehave-support capabilities

Narrative:
In order to verify weather
As a development team
I want to check that temperature in Bratislava is higher than 10 degrees

Scenario: Temperatue check

Given the value [metric] is saved as [UNITS]
Given the value [Bratislava] is saved as [CITY]
Given the value [292fd5dd7d1320cc631f22146a89ce81] is saved as [TOKEN]
When [GET] request to [OWM]/[/data/2.5/weather?q={CP:CITY}&APPID={CP:TOKEN}&units={CP:UNITS}] is sent
Then response from [OWM] REST API has status [OK] and values match:
| name      | expectedValue | verifier |
| name      | Bratislava    | EQ       |
| main.temp | 10            | GT       |
