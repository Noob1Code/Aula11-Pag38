/*
 * Copyright (C) 2024 Kayque de Freitas <kayquefreitas08@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package Empregado;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 20/03/2024
 * @brief Class Trabalho
 */
public class Trabalho extends Endereco {
    
    int cnpj;
    String razaoSocial;

    public Trabalho() {
    }

    public Trabalho(int cnpj, String razaoSocial, String rua, String bairro, String cidade, String estado, int numero, int cep) {
        super(rua, bairro, cidade, estado, numero, cep);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "Trabalho do Empregado [CNPJ= " + cnpj + ", Razão social= " + razaoSocial
                + "Nome da Rua= " + super.getRua() + ", Numero= " + super.getNumero()
                + ", CEP= " + super.getCep() + ", Bairro= " + super.getBairro() + ", Cidade= "
                + super.getCidade() + ", Estado= " + super.getEstado() + "]";
    }

}
