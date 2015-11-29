   alter table users add column email varchar(255);
   alter table users add column name varchar(255);
   alter table users add column activeAccount tinyint;
   alter table users add column activationID varchar(255);
   alter table users add column creationDate datetime;
   alter table users add column phonenumber varchar(255);
   alter table users add column requestConnectTeam varchar(255);
   alter table users add column proUser tinyint;

   alter table teammember add column admin tinyint;
   alter table teammember add column deleted tinyint;
   alter table teammember add column supporter tinyint;
   alter table teammember add column invitationEmail varchar(255);
   alter table teammember add column invitationDate datetime;
   alter table teammember add column invitationID varchar(255);
   alter table teammember add column acceptEmail bigint;
   alter table teammember add column invaller tinyint;
--   alter table teammember add column nickname varchar(255);

   alter table team add column vereniging varchar(255);
   alter table team add column sport varchar(255);
   alter table team add column voorkeursNrAanwezig bigint;
   alter table team add column tekortMailTo bigint;
   alter table team add column waarschuwingMailTo bigint;
   alter table team add column waarschuwingMailDagen bigint;
   alter table team add column reminderDays bigint;
   alter table team add column managedCompetitieID bigint;
   alter table team add column strafpunten bigint;
   alter table team add column aanvoerder varchar(255);

   alter table competition add column season varchar(255);
   alter table competition add column status bigint;

   alter table game add column meetingpoint varchar(255);
   alter table game add column score varchar(255);
   alter table game add column homegame tinyint;
   alter table game add column datetime datetime;
   alter table game add column points bigint;
   alter table game add column gameType bigint;
   alter table game add column gameStatus bigint;
   alter table game add column gameDetails varchar(255);
   alter table game add column gameReport varchar(255);
   alter table game add column remindersSended bigint;
   alter table game add column tooShortSended bigint;
   alter table game add column warningSended bigint;
