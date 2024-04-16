package br.com.giovaniocan.firstprojectudemy;

public class Greeting {
    
    // esse final serve para criar uma constante, ou seja, seu valor é imutavel
    private final Long id;
    private final String content;

    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
