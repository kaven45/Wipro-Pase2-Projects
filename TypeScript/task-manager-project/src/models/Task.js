"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.add = add;
exports.retrieve = retrieve;
exports.marked = marked;
var tasks = [
    { title: "Task 1", description: "Demo", completion_status: false },
    { title: "Task 2", description: "Test", completion_status: false }
];
function add(title) {
    return "Task Added: ".concat(title);
}
function retrieve(title, description, completion_status) {
    return "Title: ".concat(title, ", Description: ").concat(description, ", isCompleted: ").concat(completion_status);
}
function marked(title) {
    var taskArray = tasks.filter(function (task) { return task.title === title; });
    if (taskArray.length > 0) {
        taskArray[0].completion_status = true;
        return "Task marked as complete: ".concat(title);
    }
    else {
        return "Task not found: ".concat(title);
    }
}
