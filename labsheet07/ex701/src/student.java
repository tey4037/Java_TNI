public class student {
    public String name;
    public String id;
    public int score = 0;

    public void doHomeWork(int point){
        score += point;
        System.out.println(name + " did homework " + point+ " points");
    }
    public void takeExam(int point){
        score += point;
        System.out.println(name + " Took Exam " +point+ " points");
    }
    public String getResult(){
        if (score >= 50) return "Pass";
        return "fail";
    }
    public void ShowStatus(){
        System.out.println("name : "+ name);
        System.out.println("ID : "+ id);
        System.out.println("Score : "+ score);
        System.out.println("Result : "+ getResult());
    }
}
