public class Sceleton extends Boss{
    int ArrowsNumbers;

    public int getArrowsNumbers() {
        return ArrowsNumbers;
    }

    public void setArrowsNumbers(int arrowsNumbers) {
        ArrowsNumbers = arrowsNumbers;
    }

    public String printInfo() {
       return " Health of scelets: "+getHealth()+" Damage of sceleton: "+getDamage()+" Arrows Number: "+ArrowsNumbers;
    }
}
