public class snow extends human {
    private String frozenSkill;
    
    public snow(String name, double height, double weight, double speed, String gender, String frozenSkill) {
        super(name, height, weight, speed, gender);
        this.frozenSkill = frozenSkill;
    }

    public void show() {
        super.show();
        System.out.println("冰凍技能: " + frozenSkill);
    }

    public String getName() {
        return this.getName();
    }

    public double distance(double x, double y) {
        if (getName().equals("愛沙")) {
            return super.distance() * 2;
        } else {
            return super.distance();
        }
    }
}