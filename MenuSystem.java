public class MenuSystem{
// Instance Variables
  public String choice;
  public String menu;
  public String exit;

  // Constructor
  public MenuSystem(String choice, String menu, String exit){
    this.choice = choice;
    this.menu = menu;
    this.exit = exit;
    System.out.println("Menu System Created Successfully");
    
  }
  // Getters
  public String getChoice(){
    return choice;
  }
  public String getMenu(){
    return menu;
  }
  public String getExit(){
    return exit;
  }
  // Setters
  public void setChoice(String choice){
    this.choice = choice;
  }
  public void setMenu(String menu){
    this.menu = menu;
  }
  public void setExit(String exit){
    this.exit = exit;
  }
  // Methods
  public void displayMenu(){
    System.out.println("Menu System Displayed Successfully");
  }
  public void exitMenu(){
    System.out.println("Menu System Exited Successfully");
    System.exit(0);
  }


  
}