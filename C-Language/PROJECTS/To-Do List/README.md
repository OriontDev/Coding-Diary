# To-Do List
This is a simple To-Do List program where you can add task, manage the status of it and remove the task.

## Explanation
First there is two array, one is for the task name and the other is for the status, both of the array is a string array. when you want to set name of a task, a function runned where it will use `strcpy` to replace the task name with the name you wanted and that is also how setting the status work. when you are removing the task i also use `strcpy` to set the task name and status back to `None - N/A`. Here we use `fgets` instead of scanf for string so that it could also accept spaces.