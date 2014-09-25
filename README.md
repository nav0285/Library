Library
=======

Database project using java swing
                                                     DATABASE PROJECT
INTRODUCTION:  To create a library system, which has operations in different neighbourhoods. The library has two different users namely admin and the reader. Each one has a set of functions. To accomplish this, database is used to store the data and a user interface is required for the user to interact with the application. 
TOOLS:    Front end: JAVA SWING
          Back end: MYSQL
          IDE : NetBeans 7.4



 Tables :   
admin :   It has two attributes namely admin_id and password. admin_id is the primary key. The password is encrypted using MD5 algorithm before saving in the database. 
author: It has two attributes namely author_id and name. author_id is the primary key and is also auto incremented.
publisher: 
branch: 
reader:
book_info:
book: I assumed that each copy of a book has a unique book_id. So, we have different book_id’s for the same isbn.
borrow: 
reserve:
copy:




Admin Functions: 
1, Add a book copy: 


2, Search a book and its status: 


3, ADD NEW READER: 

4, Print Branch Information: 

5, Top 10 frequent borrowers in a branch

	
6, Top 10 frequent borrowed books in a branch:

7, AVG fine per reader:


READER FUNCTIONS: 

1, Search a book by ID, Title or Publisher Name:
 
2, Book Checkout: 

3, Book Return:  

4, Book Reserve:

5, Compute fine for a book borrowed:

6, List of books reserved by a reader: 
                                                                                                                                                                             
7, Book id and Titles published by a publisher: 
                    
