package cn.com.lonch.exam.entity;

/**
 * 终端实体
 * @author fei.chang
 */
public class Terminal {

    /**
     * 主键
     */
    private int id;

    /**
     * 终端名称
     */
    private String terminalName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }
}
