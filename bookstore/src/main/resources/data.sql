-- Insert Publishers
INSERT INTO publishers (name, country) VALUES ('Penguin Books', 'USA');
INSERT INTO publishers (name, country) VALUES ('HarperCollins', 'UK');
INSERT INTO publishers (name, country) VALUES ('O Reilly Media', 'USA');
INSERT INTO publishers (name, country) VALUES ('Macmillan', 'Germany');
INSERT INTO publishers (name, country) VALUES ('Simon & Schuster', 'USA');
INSERT INTO publishers (name, country) VALUES ('Bloomsbury', 'UK');

-- Insert Books
INSERT INTO books (title, genre, price, publisher_id) VALUES ('Spring Boot in Action', 'Tech', 39.99, 1);
INSERT INTO books (title, genre, price, publisher_id) VALUES ('Clean Code', 'Programming', 29.99, 2);
INSERT INTO books (title, genre, price, publisher_id) VALUES ('The Pragmatic Programmer', 'Programming', 35.50, 3);
INSERT INTO books (title, genre, price, publisher_id) VALUES ('Effective Java', 'Programming', 40.00, 1);
INSERT INTO books (title, genre, price, publisher_id) VALUES ('Design Patterns', 'Software Engineering', 45.00, 2);
INSERT INTO books (title, genre, price, publisher_id) VALUES ('Refactoring', 'Software Engineering', 38.50, 3);
INSERT INTO books (title, genre, price, publisher_id) VALUES ('Head First Java', 'Programming', 25.99, 4);
INSERT INTO books (title, genre, price, publisher_id) VALUES ('Java Concurrency in Practice', 'Programming', 42.99, 1);
INSERT INTO books (title, genre, price, publisher_id) VALUES ('Domain-Driven Design', 'Software Engineering', 50.00, 2);
INSERT INTO books (title, genre, price, publisher_id) VALUES ('You Don''t Know JS', 'JavaScript', 27.99, 3);
INSERT INTO books (title, genre, price, publisher_id) VALUES ('Python Crash Course', 'Programming', 34.99, 5);
INSERT INTO books (title, genre, price, publisher_id) VALUES ('C++ Primer', 'Programming', 44.99, 1);
INSERT INTO books (title, genre, price, publisher_id) VALUES ('Deep Learning with Python', 'AI/ML', 55.00, 6);
INSERT INTO books (title, genre, price, publisher_id) VALUES ('The Machine Learning Guide', 'AI/ML', 60.00, 3);
INSERT INTO books (title, genre, price, publisher_id) VALUES ('The Algorithm Design Manual', 'Computer Science', 52.50, 2);
INSERT INTO books (title, genre, price, publisher_id) VALUES ('Advanced Data Structures', 'Computer Science', 48.99, 5);
INSERT INTO books (title, genre, price, publisher_id) VALUES ('Neural Networks and Deep Learning', 'AI/ML', 59.99, 6);
INSERT INTO books (title, genre, price, publisher_id) VALUES ('Web Development with Django', 'Web Development', 36.99, 4);
INSERT INTO books (title, genre, price, publisher_id) VALUES ('Full Stack Development with React & Node', 'Web Development', 42.99, 3);
INSERT INTO books (title, genre, price, publisher_id) VALUES ('Cybersecurity Essentials', 'Security', 47.99, 2);
