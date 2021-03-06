/*
 *     Copyright (C) 2015-2020 chronicle.software
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.openhft.chronicle.values;

public interface JavaBeanInterfaceMoreThanOneEnums {

    MyEnum getMyEnum1();

    void setMyEnum1(MyEnum myEnum);

    MyEnum getMyEnum2();

    void setMyEnum2(MyEnum myEnum);

    BuySell getBuySell();

    void setBuySell(BuySell myEnum);
}
