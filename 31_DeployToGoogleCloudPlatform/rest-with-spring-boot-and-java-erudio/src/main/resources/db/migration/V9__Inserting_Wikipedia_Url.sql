UPDATE person
SET wikipedia_profile_url = CASE 
    WHEN id = 1 THEN 'https://en.wikipedia.org/wiki/Ayrton_Senna'
    WHEN id = 2 THEN 'https://en.wikipedia.org/wiki/Leonardo_da_Vinci'
    WHEN id = 4 THEN 'https://en.wikipedia.org/wiki/Indira_Gandhi'
    WHEN id = 5 THEN 'https://en.wikipedia.org/wiki/Mahatma_Gandhi'
    WHEN id = 7 THEN 'https://en.wikipedia.org/wiki/Muhammad_Ali'
    WHEN id = 9 THEN 'https://en.wikipedia.org/wiki/Nelson_Mandela'
    WHEN id = 12 THEN 'https://en.wikipedia.org/wiki/Nikola_Tesla'
    WHEN id = 13 THEN 'https://en.wikipedia.org/wiki/Yuri_Gagarin'
    WHEN id = 14 THEN 'https://en.wikipedia.org/wiki/Neil_Armstrong'
    WHEN id = 15 THEN 'https://en.wikipedia.org/wiki/Valentina_Tereshkova'
    WHEN id = 16 THEN 'https://en.wikipedia.org/wiki/Marie_Curie'
    WHEN id = 18 THEN 'https://en.wikipedia.org/wiki/Ada_Lovelace'
    ELSE wikipedia_profile_url
END
WHERE id <= 18;