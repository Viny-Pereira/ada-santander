package TecnicasDeProgramacao.Aula5;

import java.time.LocalDate;
import java.util.Objects;
import java.util.StringJoiner;

public class Funcionario {

    private Integer id;
    private String nome;
    private String sexo;
    private LocalDate dataNascimento;
    private String cidade;
    private String cargo;
    private LocalDate dataAdmissao;
    private Double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(sexo, that.sexo) && Objects.equals(dataNascimento, that.dataNascimento) && Objects.equals(cidade, that.cidade) && Objects.equals(cargo, that.cargo) && Objects.equals(dataAdmissao, that.dataAdmissao) && Objects.equals(salario, that.salario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, sexo, dataNascimento, cidade, cargo, dataAdmissao, salario);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Funcionario.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("nome='" + nome + "'")
                .add("sexo='" + sexo + "'")
                .add("dataNascimento=" + dataNascimento)
                .add("cidade='" + cidade + "'")
                .add("cargo='" + cargo + "'")
                .add("dataAdmissao=" + dataAdmissao)
                .add("salario=" + salario)
                .toString();
    }
}