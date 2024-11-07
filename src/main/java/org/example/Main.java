package org.example;
import org.neo4j.driver.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String uri = "bolt://localhost:7687";
        String user = "neo4j";
        String password = "Neha11@S"; // Adjust if necessary

        try (Driver driver = GraphDatabase.driver(uri, AuthTokens.basic(user, password));
             Session session = driver.session()) {
            System.out.println("Connection to Neo4j successful!");
        } catch (Exception e) {
            System.err.println("Failed to connect to Neo4j: " + e.getMessage());
        }
    }
}