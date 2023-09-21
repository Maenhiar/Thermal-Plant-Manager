# Thermal-Plant-Manager

Thermal Plant Manager is a software that allows to register condominiums used for civil use and which allows us to control and manage the automation of their thermal plants. A thermal plant is an area of a building dedicated to containing all those useful or indispensable elements for providing hot water and air conditioning to a home.
Automation is the process that allows these elements to be managed and piloted automatically, for example through software.
For reasons of practicality and feasibility, this software will not provide the development of the infrastructure necessary for any remote control nor, much less, will it provide the necessary integrations for effective communication with the elements of the thermal plants. On the contrary, the component management part will remain entirely limited to the software itself but prepared for expansions, interoperability and future integrations. This choice was also made due to the fact that, as there are countless different brands and types of the same element of the thermal plant, and considering that each of these could require a different technology to be driven in practice, it is more convenient to develop a software that implements all the basic logic and can be used in all situations, leaving the components necessary for effective communication with the specific element to be integrated modularly according to needs.

This may be useful for various companies that operate in this sector.

Functional requirements:

     -  We want to record the main data of each condominium such as address, name (optional), number of apartments and data
        of the administrator.

     -  Given that each condominium can own multiple thermal plants, similarly to the previous point, each thermal plant must
        record its address and the various elements it may possess, such as: one or more boilers, one or more circulators (the pumps that flows 
        the water in the plumbing system), one or more mixing valves (that regulate the water temperature by mixing hot water and cold water), 
        one more boiler (they are hot water accumulators for sanitary use).

     -  Each element of the boiler room has a brand and a product code that the application must keep track of.

     -  The elements of a thermal plant can follow a time schedule ("timer") in which the user chooses the day and time of switching them on or off 
        (it is possible to set multiple switching on and off on every single day of the week) and chooses the temperature that the previously
        mentioned parts of the system must reach. This desired temperature is called "setpoint".

     -  Finally, the software must provide a mechanism to turn off every element of the thermal plant immediately. This feature is very useful in
        case of problems. There must also be the possibility of activating manual mode. If this mode is active, it is not the timers that
        control the thermal plant components but it is the user who can turn anything on or off.

Non-functional requirements:

     -  The software must have good performance
