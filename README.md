# Abercrombie AEM Developer Skill Assessment

## Pre Steps (**Your Assessment will not considered or reviewed if below steps are not followed**)

1. Fork the repo using the git fork option to your personal repo.
2. Create a new branch on your repo.
3. **Do Not Create PR to Anf repo. Your code will not be considered**
3. Complete exercises below by creating/modifying code. You can architect the project how you like re: folder structure, how you name your files, etc. Please add comments at the start and end of the code (i.e. `***Begin Code - Candidate Name***` and `***END Code*****`). Use your best judgement as a developer.
3. **Push the code onto the new branch to your own public Git repository, and send the link to your recruiter / rep. Do not create PR to this repo**
4. Pretend your code is going into a `PRODUCTION` environment, or that you are writing a pull request for an established open source project. Do not rush these exercises or cut corners in the name of speed. We aren't interested in the code you can write under pressure; no one writes amazing code when they are rushing. This is your chance to show off. Write your best code.
5. This exercise is to be completed without coaching or other outside assistance. Obviously, you may feel free to use whatever online resources you like -- `StackOverflow` etc. -- but it is not acceptable to utilize other developers to help you finish this task.


## Exercise 1: Saving data into JCR

Create a form (re-using OOB component where possible) which has the following fields: First Name, Last Name, Age, Country and a Submit button.  Create a `JS clientlib` for your component and write a validation logic on submit. For validation, fetch the min and max age data from the node `/etc/age`. If the user entered age lies in between the min and max value, all the user details will be saved inside JCR (under `/var/anf-code-challenge`) otherwise, an error message will be displayed with following text `You are not eligible`.

<div style="width:400px">

![](images/Exercise-1.png)
</div>

### Acceptance Criteria:
1. Fetch node details from /etc/age having properties: `minAge` and `maxAge`.
2. When submit button is clicked, validate the age and save the user details on a node under `/var/anf-code-challenge` after successful validation.
3. Populate the dialog dropdown (country component) dynamically using `JSON` in DAM (JSON Path: `/content/dam/anf-code-challenge/exercise-1/countries.json`) and display the selected country on the page.

### Notes:
1. Please refer to `exercises/Exercise-1` folder and deploy `Exercise-1.zip` onto your `AEM 6.5.0`
2. Call `UserServlet.java` from your clientlib JS to perform the required validations.


## Exercise 2: News Feed Component

Every news feed item displays the following attributes:
1.	Title
2.	Author
3.	Current date
4.	Text/Description
5.	Image

<div style="width:400px">

![](images/Exercise-2_1.png)
</div>

### Node structure:

<div style="width:500px">

![](images/Exercise-2_2.png)
</div>

### Acceptance Criteria:

1.	Create news feed component following Adobe’s best practices.
2.	Read the news data under `/var/commerce/products/anf-code-challenge/newsData` and display it in the component.
3.	Write Unit test cases (using any unit-tests library) for the back-end code with at least `80% coverage` and commit the coverage report.

### Notes:
1. Please refer to `exercises/Exercise-2` folder and deploy `Exercise-2.zip` onto your `AEM 6.5.0`


## Exercise 3: Query JCR

Fetch the first 10 pages under the path `/content/anf-code-challenge/us/en`  where property `anfCodeChallenge` exists under the page node.

<div style="width:500px">

![](images/Exercise-3.png)
</div>

### Acceptance Criteria:
1. Fetch the first 10 pages using any two: `XPath`, `JCR-SQL2`, or `the Query Builder API`.
2. Follow Adobe's best practices for better performance.

### Notes:
1. Please refer to `exercises/Exercise-3` folder and deploy `Exercise-3.zip` onto your `AEM 6.5.0`


## Exercise 4: Saving a property on page creation

Use your best knowledge to choose among any of the eventing mechanisms available in AEM to write in to the JCR whenever a new page is created under `/content/anf-code-challenge/us/en`

### Acceptance Criteria:
1. Create a page under `/content/anf-code-challenge/us/en`.
2. As soon as the page is created, a property `pageCreated: {Boolean}true` should be saved on it.
