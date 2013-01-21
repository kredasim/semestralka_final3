Popis projektu

Splnene poziadavky:

1. skupina:
	JSF
2. skupina
	Databaza
	Medzi portletova komunikacia(public render parameter)
	Pouzivanie portlet preferences(vytiahnutie defaultnej hodnoty z portlet.xml)
	Portlet vyuziva vsetky mody
3. skupina
	Liferay Message Bus
	Liferay hook

Backend projektu je postaveny na Spring framework.
Projekt obsahuje 3 portlety:
	1) ApplyForAssignment - sluzi na zobrazeni jednotlivych assignmentov.
	2) AssignmentManager - vo view mode, zobrazuje list aktualnych assignmentov, po kliknuti je assignment
							zobrazeny portletom ApplyForAssignment. V edit mode portletu sa vytvaraju nove assignmenty.
							Help mode portletu obsahuje nejake info.
	3) ChatPortlet - portlet postaveny na Liferay Message Bus - umoznuje uzivatelom (prihlasenym aj neprihlasenym) pridavat spravy,
					ktore su nasledne zobrazene vsetkym uzivatelom daneho portletu.

Pozn:
	Pri praci s help mode som narazil na problem s com.liferay.portal.NoSuchResourceActionException.
	Suvisi to s login user check algoritmom 6.
	Ak som pridal v portal-ext tento riadok:
	permissions.user.check.algorithm = 5,
	tak to fungovalo ok.
	@see https://issues.liferay.com/browse/LPS-17238