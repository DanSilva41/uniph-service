package br.com.silva.uniph.service.dto;

import br.com.silva.uniph.domain.Aluno;
import br.com.silva.uniph.domain.Pessoa;
import br.com.silva.uniph.domain.Sexo;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

/**
 * Uma DTO representa um aluno
 *
 * @author Danilo Silva P.
 */
@EqualsAndHashCode
@Builder
@ToString
public class AlunoDTO {

    @NotNull
    @Size(min = 1, max = 7)
    private String rg;

    @NotNull
    @CPF
    @Size(min = 1, max = 11)
    private String cpf;

    public AlunoDTO() {
        // Empty constructor needed for Jackson.
    }

    public AlunoDTO(Aluno aluno) {
        this(aluno.getRg(), aluno.getCpf());
    }

    public AlunoDTO(@NotNull String rg, @NotNull String cpf) {
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}