"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Task = void 0;
class Task {
    constructor(title, description, completionStatus = false) {
        this.title = title;
        this.description = description;
        this.completionStatus = completionStatus;
    }
}
exports.Task = Task;
