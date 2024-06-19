import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GoalTest_Student_9_3 extends Application {
    public static Group root = new Group();
    
    @Override
    public void start(Stage primaryStage) {
        // Carregar as imagens
        Image dukeImage = new Image(getClass().getResource("Duke.png").toString());
        Image gloveImage = new Image(getClass().getResource("Glove.png").toString());
        
        // Criar as ImageViews
        ImageView dukeImageView = new ImageView(dukeImage);
        ImageView gloveImageView = new ImageView(gloveImage);
        
        // Configurar posição da luva (Glove)
        gloveImageView.setX(dukeImageView.getX() + 280); 
        gloveImageView.setY(dukeImageView.getY() + 200); 
        dukeImageView.setX(dukeImageView.getX() + 260);
        dukeImageView.setY(dukeImageView.getY() + 200);
        
        // Configurar evento para o botão "Goal"
        Button goalButton = new Button("Goal");
        goalButton.setLayoutX(270);
        goalButton.setLayoutY(100);
        goalButton.setOnAction(event -> handleGoalButtonClick());
        
        // Adicionar os elementos ao grupo root
        root.getChildren().addAll(dukeImageView, gloveImageView, goalButton);
        
        Scene scene = new Scene(root, 600, 500, Color.GRAY);
        
        primaryStage.setTitle("GoalTest");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    // Método para lidar com o clique no botão "Goal"
    private void handleGoalButtonClick() {
        // Reproduzir o som
        AudioClip audioClip = new AudioClip(getClass().getResource("Note5.wav").toString());
        audioClip.play();
        
        // Exibir a mensagem "gol"
        System.out.println("gol");
    }

    public static void main(String[] args) {
        launch(args);
    }
}