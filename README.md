Library
=======

Database project using java swing
                                                     DATABASE PROJECT
INTRODUCTION:  To create a library system, which has operations in different neighbourhoods. The library has two different users namely admin and the reader. Each one has a set of functions. To accomplish this, database is used to store the data and a user interface is required for the user to interact with the application. 
TOOLS:    Front end: JAVA SWING
	    Back end: MYSQL
                 IDE : NetBeans 7.4
E-R Diagram:
                                                                                                                                                                      

REALTIONAL MAPPING:
 


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



Application:
This is the welcome page of my application. It has two options, either you can select main menu or quit the application. 

When we select the main menu, the following page will be displayed. 

When we select the Admin, there are two options. You can either be an existing admin or you wanna be an admin. 
If you select ‘new’, then the following page will be displayed. 
A user can become an admin, if he enters the correct key. If he didnt have the key, then he cannot become the admin.  The admin id and password(encrypted form) is stored in the database.

In the previous window, if the user is an existing admin, he has to enter the id and password. If the user has entered the correct id and password then the following page will be displayed.  

Admin Functions: 
1, Add a book copy: 

If the admin wants to add a new book, then he has to new, then the following page will be displayed. 

The publisher can be a new publisher or an existing publisher. If he’s a new publisher then the following page will be displayed.
When we hit submit, the publishers data is stored in database. Since the publisher_id is auto incremented, no need to enter an id for publisher. 
Then the following page will be displayed. In the previous window, if the admin selects that the publisher is existing, then the same following window is displayed. 




2, Search a book and its status: 
Add a Copy:  In the Add Book window, if we select ISBN: Existing, then we get the following window. 




3, ADD NEW READER: 

4, Print Branch Information: 

5, Top 10 frequent borrowers in a branch: Selected Morgan branch. 

	
6, Top 10 frequent borrowed books in a branch:

7, AVG fine per reader:


READER FUNCTIONS: In the main menu window, if we select Reader, then the following window will be displayed. 

If the reader enters the correct reader id, then the following will be displayed I,e reader menu will be displayed. 

1, Search a book by ID, Title or Publisher Name:
 
BY ID:  When we search by id, only one book will be there. So the result has been diplayed within the same window. 


BY Title:
 
BY PUBLSIHER NAME: 
2, Book Checkout: 


Now, the book with book_id=122 is not available for others.

3, Book Return:  The difference between the two dates is 36 days. The fine is computed after 15 days and for each extra day 10 cents is charged/day. So, the fine is charged for 36-15= 21 days is 21*0.1= $2.1. 
Once the book is returned, its again available. 
4, Book Reserve: Here, 1st we select the branch and get the list available books in that branch. Next we enter the book we want, then we get the available book_id’s. 


5, Compute fine for a book borrowed:

6, List of books reserved by a reader: 
                                                                                                                                                                             
7, Book id and Titles published by a publisher: 
                    
