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

package MusicaCompositor;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 20/03/2024
 * @brief Class Compositores
 */
public abstract class Compositores {
    String nomeCompositor, nacionalidade;

    public Compositores() {
    }

    public Compositores(String nomeCompositor, String nacionalidade) {
        this.nomeCompositor = nomeCompositor;
        this.nacionalidade = nacionalidade;
    }

    public String getNomeCompositor() {
        return nomeCompositor;
    }

    public void setNomeCompositor(String nomeCompositor) {
        this.nomeCompositor = nomeCompositor;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Compositor [Nome do Compositor= " + nomeCompositor
                + ", Nacionalidade=" + nacionalidade + "]"; // Retorna uma string representando o objeto Veiculo
    }

}
