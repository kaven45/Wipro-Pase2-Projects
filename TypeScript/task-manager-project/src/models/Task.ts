export class Task {
    title: string;
    description: string;
    completionStatus: boolean;

    constructor(title: string, description: string, completionStatus: boolean = false) {
        this.title = title;
        this.description = description;
        this.completionStatus = completionStatus;
    }
}
