package com.example.application.views;

import java.util.Arrays;
import java.util.List;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.WildcardParameter;

@Route("exercise/:name")
public class ExerciseDetailsPage extends VerticalLayout implements HasUrlParameter<String> {
    
    @Override
    public void setParameter(BeforeEvent event, @WildcardParameter String exerciseName) {
        Label header = new Label("Exercise: " + exerciseName.toUpperCase());
        add(header);
        
        // Sample data for sets, populate real data later
        List<String> sets = Arrays.asList("Set 1: 50kg x 5", "Set 2: 55kg x 5", "Set 3: 60kg x 5");
        
        for (String set : sets) {
            Checkbox checkBox = new Checkbox(set);
            add(checkBox);
        }
        
        // Add a save button to log your progress
        Button saveButton = new Button("Save", e -> {
            // Save the progress
        });
        add(saveButton);
    }
}
