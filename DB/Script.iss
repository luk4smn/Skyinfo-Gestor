; Script generated by the Inno Setup Script Wizard.
; SEE THE DOCUMENTATION FOR DETAILS ON CREATING INNO SETUP SCRIPT FILES!

#define MyAppName "Gestor"
#define MyAppVersion "1.0"
#define MyAppPublisher "SkyInfo Solutions, Inc."
#define MyAppURL "http://skyinfo9.webnode.com"
#define MyAppExeName "Skyinfo_Gestor.jar"

[Setup]
; NOTE: The value of AppId uniquely identifies this application.
; Do not use the same AppId value in installers for other applications.
; (To generate a new GUID, click Tools | Generate GUID inside the IDE.)
AppId={{9B67C374-1A2F-427D-B327-CD03DBFE60CD}
AppName={#MyAppName}
AppVersion={#MyAppVersion}
;AppVerName={#MyAppName} {#MyAppVersion}
AppPublisher={#MyAppPublisher}
AppPublisherURL={#MyAppURL}
AppSupportURL={#MyAppURL}
AppUpdatesURL={#MyAppURL}
DefaultDirName=C:\SkyInfo\{#MyAppName}
DisableProgramGroupPage=yes
OutputDir=C:\Users\Lucas\Desktop
OutputBaseFilename=setup
SetupIconFile=C:\Gestor\IMAGENS EXTRAS\website-icon.ico
Compression=lzma
SolidCompression=yes

[Languages]
Name: english; MessagesFile: compiler:Default.isl
Name: brazilianportuguese; MessagesFile: compiler:Languages\BrazilianPortuguese.isl

[Tasks]
Name: desktopicon; Description: {cm:CreateDesktopIcon}; GroupDescription: {cm:AdditionalIcons}; Flags: checkedonce
Name: quicklaunchicon; Description: {cm:CreateQuickLaunchIcon}; GroupDescription: {cm:AdditionalIcons}; OnlyBelowVersion: 0,6.1; Flags: checkedonce

[Files]
Source: C:\Gestor\Skyinfo Gestor\dist\Skyinfo_Gestor.jar; DestDir: {app}; Flags: ignoreversion
Source: C:\Gestor\Skyinfo Gestor\config.ini; DestDir: {app}; Flags: ignoreversion
Source: C:\Gestor\Skyinfo Gestor\DB\postgresql.exe; DestDir: {app}; Flags: ignoreversion
Source: C:\Gestor\Skyinfo Gestor\img\*; DestDir: {app}\img; Flags: ignoreversion recursesubdirs createallsubdirs
Source: C:\Gestor\Skyinfo Gestor\dist\lib\*; DestDir: {app}\lib; Flags: ignoreversion recursesubdirs createallsubdirs
Source: C:\Gestor\Skyinfo Gestor\Relatorios\*; DestDir: {app}\Relatorios; Flags: ignoreversion recursesubdirs createallsubdirs
Source: C:\Gestor\Skyinfo Gestor\DB\data.backup; DestDir: {app}\data; Flags: ignoreversion recursesubdirs createallsubdirs
; NOTE: Don't use "Flags: ignoreversion" on any shared system files
Source: icone.ico; DestDir: {app}; DestName: icone.ico; Flags: ignoreversion

[Icons]
Name: {commonprograms}\{#MyAppName}; Filename: {app}\Skyinfo_Gestor.jar; IconFilename: {app}\icone.ico; IconIndex: 0; Tasks: 
Name: {commondesktop}\{#MyAppName}; Filename: {app}\Skyinfo_Gestor.jar; Tasks: desktopicon; IconFilename: {app}\icone.ico; IconIndex: 0
Name: {userappdata}\Microsoft\Internet Explorer\Quick Launch\{#MyAppName}; Filename: {app}\Skyinfo_Gestor.jar; Tasks: quicklaunchicon; IconFilename: {app}\icone.ico; IconIndex: 0

[Run]
Filename: {app}\jre-8u74-windows-i586.exe; Description: {cm:LaunchProgram,{#StringChange(MyAppName, '&', '&&')}}; Flags: shellexec postinstall; Tasks: ; Languages: 
