# Monefy Mobile Applications Exploratory Testing

## Target: 
Verify correct functioning about process to add expenses and incomes in Monefy application and that information is displayed into detailed charts with its specific category and affect total balance.

## Test Cases:
1.	Add expense and review balance change
2.	Add income and review balance change
3.	Review balance and verify that the expense and income added previously will be show
4.	Edit an existed expense and review balance change
5.	Edit an existed income and review balance change
6.	Search an expense or income that was added previously with the Search record function and verify that this record show in screen with the value and category
7.	Delete an existed expense from edit option and review balance change
8.	Delete an existed income from edit option and review balance change
9.	Search an expense or income that was deleted previously with the Search record function and verify that this record cannot display in screen

## Priorization:
I would start to test the process to add expenses and incomes, because this is the main function of application and that functionality will be most used by users. For this function I planned to spend 1 hour to test it
Then, I would test balance chart, because that is the next option that users review after adding an income or expense and that it is the best way to check if balance is being affected for it. For this function I planned to spend 45 minutes to test it
Finally, I would test transfers option because this function possibly won’t be used frequently for the users and it’s not the main function of the application. For this function I planned to spend 15 minutes to test it

## Risks:
1.	The main risk that I want to mitigate with these tests is the expenses or incomes couldn’t add them or not do not affect the balance 
2.	Another risk that I want to mitigate is in balance chart would not be displayed some expenses or incomes expenses or incomes record that user added previously or those would be displayed in wrong category
3.	Another risk that I think with these tests would be mitigated is that user could not find some income or expense record or would get a different record that he was looking for.

## Bugs found:
1.	When you are adding an income or expense the field name “Note” is confusing for its function (that is to put a name for the expense or income) because the user would think that field is for put the value or the record. I suggest that name will be change for movement name.
2.	When you are adding an income, Calculator allow divide by zero. App would display an error message explaining that it is not permitted division by zero
3.	With calculator when you try to multiply two or more numbers that result exceed the result field size, the application displays a zero as an operation result.
4.	When you add a movement (income or expense) or edit one, if you add or subtract two or more values and then multiply a value, result is wrong
5.	When you edit a movement, but you don’t want save change (because you wrote a wrong value or you edited the wrong record, etc.) it’s not possible to discard change
6.	When you edit a movement (income or expense) and add, subtract, multiply and/or divide a value, the screen displays the result but there are not buttons to save the change (or discard it), the only way to save changes is touch phone back button and this would be confuse for users
