package CaseStudy.service;

public interface Service<T, L> {
    void displayAll();

    void add();

    void set();

    T find(String code);

    L findAll();
}
