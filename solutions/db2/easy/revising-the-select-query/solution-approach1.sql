-- ──────────────────────────────────────────────────
-- Link        https://www.hackerrank.com/challenges/revising-the-select-query/problem?isFullScreen=true
-- Problem     Revising the Select Query I
-- Difficulty  Easy
-- Subdomain   Basic Select
-- Platform    HackerRank
-- Language    db2
-- Status      Accepted
-- Submitted   2026-09-22, 11:15 p.m.
-- ──────────────────────────────────────────────────

SELECT *
FROM CITY
WHERE CountryCode = 'USA'
AND Population > 100000;
