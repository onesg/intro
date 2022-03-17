package br.com.gabrielpossar.intro.model;

public class Welcome {

    private Long id;
    private String name;
    private String msg;

    /* contrutor vázio */
    public Welcome() {
    }

    /* Construtor polimórfico */
    public Welcome(Long id, String name, String msg) {
        this.id = id;
        this.name = name;
        this.msg = msg;
    }

    /* medotos Getteer e Setters */
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMsg() {
        return msg;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
