"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Task_1 = require("../models/Task");
var title = "Learn TypeScript";
var description = "Complete the TypeScript tutorial";
var completion_status = false;
var result = (0, Task_1.add)(title);
console.log(result);
var result2 = (0, Task_1.retrieve)(title, description, completion_status);
console.log(result2);
console.log((0, Task_1.marked)("Learn TypeScript")); // Mark as complete
// let Alltasks:string[]=[title,description,completion_status.toString()];
// console.log(Alltasks);
