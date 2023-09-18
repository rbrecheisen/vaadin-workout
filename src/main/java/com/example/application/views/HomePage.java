package com.example.application.views;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("home")
public class HomePage extends VerticalLayout {
    
    public HomePage() {
        Label header = new Label("Today's Workout: " + LocalDate.now().toString());
        add(header);
        
        // Populate this with real data later
        List<String> exercises = Arrays.asList("Bench Press", "Squat", "Deadlift");
        
        for (String exercise : exercises) {
            Button exerciseButton = new Button(exercise, e -> {
                // Navigate to detail page
                UI.getCurrent().navigate("exercise/" + exercise.toLowerCase());
            });
            add(exerciseButton);
        }
    }
}
