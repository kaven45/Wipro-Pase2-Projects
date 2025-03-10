"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const TaskManager_1 = __importDefault(require("./services/TaskManager")); // Use relative path correctly
const taskManager = new TaskManager_1.default();
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
