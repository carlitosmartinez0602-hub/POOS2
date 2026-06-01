package Unidad_4.Practica_6;

public class Battery {
    private int batterypercent;
    private boolean isCharging;

    protected Battery(int charge){
        if (charge < 0) {
            throw new IllegalArgumentException("No puede ser negativo");
        }
        this.batterypercent = charge;
        this.isCharging = false;
    }

    protected boolean isCharging(){
        return isCharging;
    }

    protected void decrementCharge(){
        if (batterypercent > 0) {
            batterypercent--;
        }
    }

    @Override
    public String toString() {
        String fn;
        if (isCharging) {
            fn = "being charged";
        } else {
            fn = "not being charged";
        }
        return batterypercent + "% charged (" + fn + ")";
    }
}