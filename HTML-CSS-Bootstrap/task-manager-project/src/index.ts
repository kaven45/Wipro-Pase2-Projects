import TaskManager from "./services/TaskManager";  

const taskManager = new TaskManager();

console.log(taskManager.addTask("Task 1", "Demo Task"));
console.log(taskManager.addTask("Task 2", "Test Task"));

console.log(taskManager.retrieveTask("Task 1"));

console.log(taskManager.markComplete("Task 1"));
console.log(taskManager.retrieveTask("Task 1"));



// import { TaskManager } from "./services/TaskManager";

// const taskManager = new TaskManager();

// console.log(taskManager.addTask("Task 1", "Demo Task"));
// console.log(taskManager.addTask("Task 2", "Test Task"));

// console.log(taskManager.retrieveTask("Task 1"));

// console.log(taskManager.markComplete("Task 1"));
// console.log(taskManager.retrieveTask("Task 1"));

