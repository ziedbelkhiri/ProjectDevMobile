package com.example.gestionnairedestaches

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val taskList = mutableListOf("Acheter des courses", "Faire du sport", "Préparer la réunion")
    private lateinit var taskAdapter: TaskAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewTasks)
        taskAdapter = TaskAdapter(taskList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = taskAdapter

        val addButton = findViewById<Button>(R.id.buttonAddTask)
        val taskInput = findViewById<EditText>(R.id.editTextTask)

        addButton.setOnClickListener {
            val newTask = taskInput.text.toString().trim()
            if (newTask.isNotEmpty()) {
                taskList.add(newTask)
                taskAdapter.notifyItemInserted(taskList.size - 1)
                taskInput.text.clear()
            } else {
                Toast.makeText(this, "Veuillez entrer une tâche", Toast.LENGTH_SHORT).show()
            }
        }
    }
}