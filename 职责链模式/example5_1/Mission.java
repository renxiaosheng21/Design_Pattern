package example5_1;

/**
 * Created by RYH on 2016/12/12.
 */
public class Mission {
    private String code;
    private int enemyNumber;

    public Mission(String code,int enemyNumber){
        this.code=code;
        this.enemyNumber=enemyNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getEnemyNumber() {
        return enemyNumber;
    }

    public void setEnemyNumber(int enemyNumber) {
        this.enemyNumber = enemyNumber;
    }
}
