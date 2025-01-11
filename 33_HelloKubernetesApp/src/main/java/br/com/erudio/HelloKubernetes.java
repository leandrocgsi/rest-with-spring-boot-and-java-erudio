package br.com.erudio;

public class HelloKubernetes {
    
    private final String content;
    private final String environment;
    
    public HelloKubernetes(String content, String environment) {
        this.content = content;
        this.environment = environment;
    }

    public String getContent() {
        return content;
    }

    public String getEnvironment() {
        return environment;
    }
}
