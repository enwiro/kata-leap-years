# kata-leap-years

Ce Kata se base sur un kata existant : https://codingdojo.org/kata/LeapYears/

Ce repository est fait pour être utilisé comme fork avec KillerCoda avec un environnement TS : https://killercoda.com/hoppr/scenario/kata-ts

## Kata - Les années bissextiles

Ce kata court et simple doit être réalisé par deux personnes à l'aide du développement piloté par les tests (TDD).

Avant 1582, le calendrier julien était largement utilisé et définissait les années bissextiles comme toutes les années divisibles par 4. Cependant, à la fin du XVIe siècle, on s'est aperçu que l'année civile avait dérivé d'environ 10 jours par rapport à l'année solaire. Le calendrier grégorien a été défini afin de réduire le nombre d'années bissextiles et d'aligner plus étroitement l'année civile sur l'année solaire. Il a été adopté dans les pays papaux le 15 octobre 1582, en sautant 10 jours par rapport à la date du calendrier julien. Les pays protestants ont adopté le calendrier grégorien après un certain temps.

Le calendrier grégorien est assez précis, mais il pourrait être rendu encore plus précis en ajoutant une règle supplémentaire qui élimine les années divisibles par 4000 comme années bissextiles. Mais je suppose que nous aviserons le moment venu. Envisagez d'ajouter cette règle comme deuxième histoire en complément de l'exercice.

### Histoire utilisateur (User Story 👀) :

En tant qu'utilisateur, je veux savoir si une année est une année bissextile, afin de pouvoir prévoir un jour supplémentaire le 29 février pendant ces années-là.

### Critères d'acceptation :
- [ ] Toutes les années divisibles par 400 **SONT** des années bissextiles (ainsi, par exemple, 2000 était bien une année bissextile).
- [ ] Toutes les années divisibles par 100 mais pas par 400 **NE SONT PAS** des années bissextiles (ainsi, par exemple, 1700, 1800 et 1900 n'étaient **PAS** des années bissextiles, et 2100 ne sera **PAS** non plus une année bissextile).
- [ ] Toutes les années divisibles par 4 mais non par 100 **SONT** des années bissextiles (par exemple, 2008, 2012, 2016),
- [ ] Toutes les années non divisibles par 4 ne sont **PAS** des années bissextiles (par exemple, 2017, 2018, 2019).

**Bon code !**

## Kata - Leap Years

This short and simple Kata should be performed in pairs using Test Driven Development (TDD).

Prior to 1582, the Julian Calendar was in wide use and defined leap years as every year divisible by 4. However, it was found in the late 16th century that the calendar year had drifted from the solar year by approximately 10 days. The Gregorian Calendar was defined in order to thin out the number of leap years and to more closely align the calendar year with the solar year. It was adopted in Papal countries on October 15, 1582, skipping 10 days from the Julian Calendar date. Protestant countries adopted the Gregorian Calendar after some time.
The Gregorian Calendar is quite accurate, but could be made more accurate by adding an additional rule that eliminates years divisible by 4000 as leap years. But I guess we’ll cross that bridge when we come to it. Consider adding this rule as a second story as an extension to the exercise.

## User Story :

As a user, I want to know if a year is a leap year, So that I can plan for an extra day on February 29th during those years.

## Acceptance Criteria :

- [ ] All years divisible by 400 **ARE** leap years (so, for example, 2000 was indeed a leap year),
- [ ] All years divisible by 100 but not by 400 are **NOT** leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, **NOR** will 2100 be a leap year),
- [ ] All years divisible by 4 but not by 100 **ARE** leap years (e.g., 2008, 2012, 2016),
- [ ] All years not divisible by 4 are **NOT** leap years (e.g. 2017, 2018, 2019).
