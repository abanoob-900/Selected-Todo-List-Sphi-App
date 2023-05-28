package com.bob.selected_todo_list_sphi_app;

import com.bob.selected_todo_list_sphi_app.database.AppDatabase;
import com.bob.selected_todo_list_sphi_app.database.TaskEntry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

class AddTaskViewModel extends ViewModel {

    private LiveData<TaskEntry> task;


    public AddTaskViewModel(AppDatabase database, int taskId) {
        task =  database.taskDao().loadTaskById(taskId);
    }

    public LiveData<TaskEntry> getTask() {
        return task;
    }
}
