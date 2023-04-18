package org.example.app.views.positions;

import org.example.app.entities.Position;

import java.util.Scanner;

public class PositionCreateView {

    public Position getData() {

        Scanner scanner = new Scanner(System.in);
        Position position = new Position();

        String title = "Enter position name: ";
        System.out.print(title);
        position.setName(scanner.nextLine().trim());

        String idp = "Enter position id: ";
        System.out.print(idp);
        position.setId(scanner.nextInt());



        return position;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
