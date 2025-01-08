CREATE TABLE IF NOT EXISTS `person_books` (
  `person_id` bigint(20) NOT NULL,
  `book_id` int(10) NOT NULL,
  PRIMARY KEY (`person_id`, `book_id`),
  FOREIGN KEY (`person_id`) REFERENCES `person`(`id`) ON DELETE CASCADE,
  FOREIGN KEY (`book_id`) REFERENCES `books`(`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;