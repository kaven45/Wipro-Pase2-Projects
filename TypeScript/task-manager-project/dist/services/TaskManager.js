"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.TaskManager = void 0;
class TaskManager {
    constructor() {
        this.tasks = [];
    }
    addTask(title, description) {
        this.tasks.push({ title, description, completion_status: false });
        return `Task Added: ${title}`;
    }
    retrieveTask(title) {
        const task = this.tasks.find(task => task.title === title);
        return task ? `Title: ${task.title}, Description: ${task.description}, isCompleted: ${task.completion_status}` : "Task not found";
    }
    markComplete(title) {
        const task = this.tasks.find(task => task.title === title);
        if (task) {
            task.completion_status = true;
            return `Task marked as complete: ${title}`;
        }
        else {
            return `Task not found: ${title}`;
        }
    }
}
exports.TaskManager = TaskManager;
exports.default = TaskManager;
