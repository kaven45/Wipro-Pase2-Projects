export class TaskManager {
    tasks: { title: string; description: string; completion_status: boolean }[] = [];

    addTask(title: string, description: string): string {
        this.tasks.push({ title, description, completion_status: false });
        return `Task Added: ${title}`;
    }

    retrieveTask(title: string): string {
        const task = this.tasks.find(task => task.title === title);
        return task ? `Title: ${task.title}, Description: ${task.description}, isCompleted: ${task.completion_status}` : "Task not found";
    }

    markComplete(title: string): string {
        const task = this.tasks.find(task => task.title === title);
        if (task) {
            task.completion_status = true;
            return `Task marked as complete: ${title}`;
        } else {
            return `Task not found: ${title}`;
        }
    }
}

export default TaskManager;
