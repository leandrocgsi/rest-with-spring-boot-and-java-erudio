-- Atualizar os campos de photo_url para as 12 primeiras pessoas famosas
UPDATE person
SET photo_url = CASE 
    WHEN id = 1 THEN 'https://raw.githubusercontent.com/leandrocgsi/rest-with-spring-boot-and-java-erudio/refs/heads/main/photos/01_senna.jpg'
    WHEN id = 2 THEN 'https://raw.githubusercontent.com/leandrocgsi/rest-with-spring-boot-and-java-erudio/refs/heads/main/photos/02_da_vinci.jpg'
    WHEN id = 4 THEN 'https://raw.githubusercontent.com/leandrocgsi/rest-with-spring-boot-and-java-erudio/refs/heads/main/photos/04_indira.jpg'
    WHEN id = 5 THEN 'https://raw.githubusercontent.com/leandrocgsi/rest-with-spring-boot-and-java-erudio/refs/heads/main/photos/05_mahatma.jpg'
    WHEN id = 7 THEN 'https://raw.githubusercontent.com/leandrocgsi/rest-with-spring-boot-and-java-erudio/refs/heads/main/photos/07_muhammad_ali.jpg'
    WHEN id = 9 THEN 'https://raw.githubusercontent.com/leandrocgsi/rest-with-spring-boot-and-java-erudio/refs/heads/main/photos/09_mandela.jpg'
    WHEN id = 12 THEN 'https://raw.githubusercontent.com/leandrocgsi/rest-with-spring-boot-and-java-erudio/refs/heads/main/photos/12_nikola_tesla.jpg'
    WHEN id = 13 THEN 'https://raw.githubusercontent.com/leandrocgsi/rest-with-spring-boot-and-java-erudio/refs/heads/main/photos/13_yuri_gagarin.jpg'
    WHEN id = 14 THEN 'https://raw.githubusercontent.com/leandrocgsi/rest-with-spring-boot-and-java-erudio/refs/heads/main/photos/14_neil_armstrong.jpg'
    WHEN id = 15 THEN 'https://raw.githubusercontent.com/leandrocgsi/rest-with-spring-boot-and-java-erudio/refs/heads/main/photos/15_valentina_tereshkova.jpg'
    WHEN id = 16 THEN 'https://raw.githubusercontent.com/leandrocgsi/rest-with-spring-boot-and-java-erudio/refs/heads/main/photos/16_marie_curie.jpg'
    WHEN id = 18 THEN 'https://raw.githubusercontent.com/leandrocgsi/rest-with-spring-boot-and-java-erudio/refs/heads/main/photos/18_ada_lovelace.jpg'

    ELSE photo_url
END
WHERE id <= 18;
