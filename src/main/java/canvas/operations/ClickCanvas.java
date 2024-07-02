package canvas.operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

public class ClickCanvas {
    public static void main(String[] args) throws InterruptedException {
    	// Initialize the WebDriver (Chrome in this case)
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the web page containing the canvas
            driver.get("https://facility-operations.prd.it.unity3d.com/");
            driver.manage().window().maximize();

            // Locate the canvas element by its ID
            Thread.sleep(100000);
            //Thread.sleep(1000);
            WebElement canvas = driver.findElement(By.id("unity-canvas"));

            // Create Actions instance
            Actions actions = new Actions(driver);

            // Get the position of the canvas element
            int canvasX = canvas.getLocation().getX();
            int canvasY = canvas.getLocation().getY();

            // Calculate the absolute position within the canvas
            int clickX = canvasX + 728;
            int clickY = canvasY + 344;

            // Move to the canvas element
            actions.moveToElement(canvas).perform();

            // Click at the calculated coordinates
            actions.moveByOffset(clickX, clickY).click().perform();

            // Optionally, you can add a delay or wait for some time
            Thread.sleep(2000);

        } finally {
            // Close the WebDriver instance
            driver.quit();
        }
    }
}
